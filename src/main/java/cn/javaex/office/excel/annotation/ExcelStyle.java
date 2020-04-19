package cn.javaex.office.excel.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface ExcelStyle {
	
	/**
	 * 自定义样式实现类名
	 * @return
	 */
	public String cellStyle() default "cn.javaex.office.excel.style.DefaultCellStyle";
	
	/**
	 * 标题栏高度
	 * @return
	 */
	public int titleHeight() default 0;
	
	/**
	 * 表头高度
	 * @return
	 */
	public int headerHeight() default 0;
	
	/**
	 * 数据行高度
	 * @return
	 */
	public int dataHeight() default 0;
	
}