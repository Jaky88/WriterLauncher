package com.onyx.writer.launcher;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by 12345 on 2017/4/28.
 */

public class TabPageFragment extends Fragment {
    private int page;
    public static final String PAGE_POSITION = "page_position";
    private String[] names;
    private TextView tv_fragment;

    public static TabPageFragment getInstance(int position) {
        TabPageFragment tabPageFragment = new TabPageFragment();
        Bundle bundle = new Bundle();
        bundle.putInt(PAGE_POSITION, position);
        tabPageFragment.setArguments(bundle);
        return tabPageFragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tab, container, false);
        tv_fragment = (TextView) view.findViewById(R.id.tv_fragment);
        tv_fragment.setText(names[page]);
        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        page = this.getArguments().getInt(PAGE_POSITION);
        names = getResources().getStringArray(R.array.tab_title);
        System.out.println(page);
    }
}
