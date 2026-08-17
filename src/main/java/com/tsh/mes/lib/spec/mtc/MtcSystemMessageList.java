package com.tsh.mes.lib.spec.mtc;

public enum MtcSystemMessageList {

	CARR_MOVE_REQ("CST 이동 요청 (OFS -> MTC)");

	private final String description;

	MtcSystemMessageList(String description) {
		this.description = description;
	}

	public static void main(String[] args) {
		System.out.println(
			MtcSystemMessageList.CARR_MOVE_REQ.name()
		);
	}

}
