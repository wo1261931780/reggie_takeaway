package junw.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author junw
 */
@Data
public class AddressBook implements Serializable {
	/**
	 * 主键
	 */
	private Long id;

	/**
	 * 用户id
	 */
	private Long userId;

	/**
	 * 收货人
	 */
	private String consignee;

	/**
	 * 性别 0 女 1 男
	 */
	private Byte sex;

	/**
	 * 手机号
	 */
	private String phone;

	/**
	 * 省级区划编号
	 */
	private String provinceCode;

	/**
	 * 省级名称
	 */
	private String provinceName;

	/**
	 * 市级区划编号
	 */
	private String cityCode;

	/**
	 * 市级名称
	 */
	private String cityName;

	/**
	 * 区级区划编号
	 */
	private String districtCode;

	/**
	 * 区级名称
	 */
	private String districtName;

	/**
	 * 详细地址
	 */
	private String detail;

	/**
	 * 标签
	 */
	private String label;

	/**
	 * 默认 0 否 1是
	 */
	private Byte isDefault;

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

	/**
	 * 是否删除
	 */
	private Integer isDeleted;

	private static final long serialVersionUID = 1L;
}
