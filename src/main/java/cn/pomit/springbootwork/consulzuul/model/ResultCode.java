package cn.pomit.springbootwork.consulzuul.model;

/**
 * 
 */
public enum ResultCode {
	CODE_00000("00000", "success"), 
	CODE_00001("00001", "failed");

	private String code;
	private String desc;

	ResultCode(String code, String desc) {
		this.code = code;
		this.desc = desc;
	}

	public String getCode() {
		return code;
	}

	public String getDesc() {
		return desc;
	}

	public static ResultCode getResultCodeByCode(String code) {
		for (ResultCode resultCode : ResultCode.values()) {
			if (code.equals(resultCode.getCode())) {
				return resultCode;
			}
		}
		return null;
	}

	public static ResultCode getResultCodeByDesc(String desc) {
		for (ResultCode resultCode : ResultCode.values()) {
			if (desc.equals(resultCode.getDesc())) {
				return resultCode;
			}
		}
		return null;
	}
}
