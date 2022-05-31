package ar.com.educacionit.enums;

public enum ViewsEnum {
    LISTADO("cupones/list"),
    INDEX("index");

    private String view;

    private ViewsEnum(String view) {
        this.view = view;
    }

    public String getView() {
        return view;
    }


}
