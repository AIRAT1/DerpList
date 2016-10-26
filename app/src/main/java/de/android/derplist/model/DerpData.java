package de.android.derplist.model;


import java.util.ArrayList;
import java.util.List;

import de.android.derplist.R;

public class DerpData {
    private static final String[] titles = {"Nothingness cannot be defined",
            "Time is like a river made up of the events which happen, and a violet stream; " +
                    "for as soon as a thing has been seen. It is carried away, and another comes" +
                    " in its place, and this will be carried away too,",
            "But when i know that the glass is already broken, every minute with it is precious,",
            "For me, it is far better to grasp the Universe as it really is than to persist in" +
                    "delusion, however satisfying and reassuring.",
            "The seeker after the truth is not one who studies the writings of the ancients and, " +
                    " following this natural disposition, puts his trust in them, but rather the" +
                    " one who suspects his faith in them and question what he gathers from them," +
                    "the one who submits to argument and demonstration, and not to the " +
                    "sayings of a human being whose nature is fraught with all kinds " +
                    "of imperfection and deficiency.",
            "You must take personal responsibility. You cannot change the circumstances, the" +
                    " seasons, or the wind, but you can change yourself. That is something you" +
                    " have change of"};
    private static final String[] subtitles = {"Bruce Lee",
            "Marcus Aurelius",
            "Weng Tzu",
            "Ajahn Chah",
            "Carl Sagan",
            "Alhazen",
            "Jim Rohn"};
    private static final int icon = R.drawable.ic_tonality;

    public static List<ListItem> getListData() {
        List<ListItem> data = new ArrayList<>();

        // Repeat process 4 times, so that we have enough data to demonstrate a scrollable
        // RecyclerView

        for (int x = 0; x < 4; x++) {
            for (int i = 0; i < titles.length; i++) {
                ListItem item = new ListItem();
                item.setTitle(titles[i]);
                item.setSubTitle(subtitles[i]);
                data.add(item);
            }
        }
        return data;

    }
}
