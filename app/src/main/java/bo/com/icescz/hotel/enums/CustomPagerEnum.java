package bo.com.icescz.hotel.enums;


import bo.com.icescz.hotel.R;

public enum CustomPagerEnum {

    RED(R.string.one, R.layout.view_form_hote_one),
    BLUE(R.string.two, R.layout.view_form_hote_two),
    ORANGE(R.string.three, R.layout.view_form_hote_three);

    private int mTitleResId;
    private int mLayoutResId;

    CustomPagerEnum(int titleResId, int layoutResId) {
        mTitleResId = titleResId;
        mLayoutResId = layoutResId;
    }

    public int getTitleResId() {
        return mTitleResId;
    }

    public int getLayoutResId() {
        return mLayoutResId;
    }
}
