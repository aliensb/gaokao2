package ku6.tv.gaokao.model.vo;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;

@Getter
@Setter
public class GradeSearchVo {
    private Double grade;
    private Integer weici;
    private Double bodongzhi;
    private String province;
    private String city;
    private String pici;
    private String wenli;
    private String banxue;
    private Integer sort;
}
