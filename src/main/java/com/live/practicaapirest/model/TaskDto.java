package com.live.practicaapirest.model;

import lombok.AllArgsConstructor;
import lombok.Builder;

@AllArgsConstructor
@Builder
public class TaskDto {
    private Integer id;
    private String title;
    private String description;
    private Integer priority;
    private String status;

}
