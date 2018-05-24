package ku6.tv.gaokao.model.vo;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;

@Getter
@Setter
public class LoginVo {
    @NotBlank(message = "学生身份证号不能为空")
    @Length(min=15, max=18,message = "学生身份证号不正确")
    private String stIdno;
    @NotBlank(message = "学生姓名不能为空")
    private String stName;
    @Digits(integer = 3,fraction = 1,message = "学生分数不能为空")
    private double stGrade;
    @NotBlank(message = "教师账号不能为空")
    private String teacher;
    @NotBlank(message = "密码不能为空")
    private String secret;
}
