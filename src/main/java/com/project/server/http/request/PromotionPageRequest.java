package com.project.server.http.request;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonNaming(value = PropertyNamingStrategies.SnakeCaseStrategy.class)
public class PromotionPageRequest {
    @Schema(description = "제목" , example = "제목")
    private String title;
    @Schema(description = "내용" , example = "내용")
    private String contents;
    @Schema(description = "작성자" , example = "나")
    private String userId;
    @Schema(description = "하위 카테고리" , example = "하위 카테고리")
    private String subCategory;
}
