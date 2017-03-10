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
    TextView mFirstName;
    EditText sFirstName;
    TextView mLastName;
    EditText sLastName;
    FamilyMember daddy;

    daddy.setFirstName("John");
    daddy.setLastName("Johnson");

    mFirstName = setText(R.id.firstName);

    public View onCreateView(LayoutInflater inflater, ViewGroup group, Bundle bundle){
        super.onCreateView(inflater, group, bundle);
        View rootView = inflater.inflate(R.layout.fragment_family_member, group, false);
        return rootView;
    }
}
