package org.pltw.examples.collegeapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;


/**
 * Created by alcantara94106 on 3/2/2017.
 */

public class FamilyMemberFragment extends android.support.v4.app.Fragment {
    private TextView mFirstName;
    private EditText mEditFirstName;
    private TextView mLastName;
    private EditText mEditLastName;

    mFirstName = (TextView)rootView.findViewById(R.id.profileFirstNameView);

    public View onCreateView(LayoutInflater inflater, ViewGroup group, Bundle bundle){
        super.onCreateView(inflater, group, bundle);
        View rootView = inflater.inflate(R.layout.fragment_family_member, group, false);
        return rootView;
    }
}
