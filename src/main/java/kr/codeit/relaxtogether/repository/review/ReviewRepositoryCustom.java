package kr.codeit.relaxtogether.repository.review;

import kr.codeit.relaxtogether.dto.review.request.ReviewSearchCondition;
import kr.codeit.relaxtogether.dto.review.response.GatheringReviewsResponse;
import kr.codeit.relaxtogether.dto.review.response.ReviewDetailsResponse;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;

public interface ReviewRepositoryCustom {

    Slice<ReviewDetailsResponse> findReviewsByUserId(Long userId, Pageable pageable);

    GatheringReviewsResponse findReviewsByGatheringId(Long gatheringId, Pageable pageable);

    Slice<ReviewDetailsResponse> findReviewsByConditions(ReviewSearchCondition reviewSearchCondition,
        Pageable pageable);
}
