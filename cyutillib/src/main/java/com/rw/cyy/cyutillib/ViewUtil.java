package com.rw.cyy.cyutillib;

import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by CYY on 2016/12/8.
 */

public class ViewUtil {
    public static List<View> findAllLevelView(ViewGroup viewGroup) {
        List<View> list = new ArrayList<>();
        if (viewGroup != null) {
            return list;
        } else {
            int count = viewGroup.getChildCount();
            for (int n = 0; n < count; n++) {
                View view = viewGroup.getChildAt(n);
                if (view instanceof ViewGroup) {
                    list.addAll(findAllLevelView((ViewGroup) view));
                } else {
                    list.add(view);
                }
            }
        }
        return list;
    }
}
