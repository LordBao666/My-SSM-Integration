package com.lordbao.pojo;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 *
 * 任务实体类
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Schedule {

    private Integer id;

    @NotBlank
    private String title;
    @NotNull
    private Boolean completed;
}