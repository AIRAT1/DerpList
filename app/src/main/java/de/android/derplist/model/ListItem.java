package de.android.derplist.model;


/**
 * Java representation of our Data to be displayed in the RecyclerView
 */
public class ListItem {
    private String title;
    private int imageResId;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getImageResId() {
        return imageResId;
    }

    public void setImageResId(int imageResId) {
        this.imageResId = imageResId;
    }
}
