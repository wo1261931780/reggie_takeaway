package junw.entity;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

/**
 * @author junw
 */
@Data
public class Category implements Serializable {
	/**
	 * 主键
	 */
	private Long id;

	/**
	 * 类型   1 菜品分类 2 套餐分类
	 */
	private Integer type;

	/**
	 * 分类名称
	 */
	private String name;

	/**
	 * 顺序
	 */
	private Integer sort;

	/**
	 * 创建时间
	 */
	@TableField(fill = FieldFill.INSERT)
	private Date createTime;

	/**
	 * 更新时间
	 */
	@TableField(fill = FieldFill.INSERT_UPDATE)
	private Date updateTime;

	/**
	 * 创建人
	 */
	@TableField(fill = FieldFill.INSERT)
	private Long createUser;

	/**
	 * 修改人
	 */
	@TableField(fill = FieldFill.INSERT_UPDATE)
	private Long updateUser;

	private static final long serialVersionUID = 1L;
}
