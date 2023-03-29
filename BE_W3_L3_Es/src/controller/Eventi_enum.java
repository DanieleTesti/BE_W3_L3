package controller;

public enum Eventi_enum {

	Publico("PUBBLICO"), privato("privato");

	private String str;

	Eventi_enum(String string) {
        this.str = string;
    }

	public String getEventEnum() {
		return str;
	}

}
