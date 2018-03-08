package edu.nasredine.cheniki.fragmentsdynamiques;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by cheniki on 08/03/2018.
 */

public class FragmentDynamique extends Fragment {



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_1_layout,
                container, false);
        return rootView;
    }
}
