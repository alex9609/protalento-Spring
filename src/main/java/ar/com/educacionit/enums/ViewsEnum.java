package ar.com.educacionit.enums;

public enum ViewsEnum {
    LISTADO("cupones/list"),
    INDEX("index"),
    NEW("/cupones/new");

    private String view;

    private ViewsEnum(String view) {
        this.view = view;
    }

    public String getView() {
        return view;
    }


}
