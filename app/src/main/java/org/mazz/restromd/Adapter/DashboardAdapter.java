package org.mazz.restromd.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TableRow;
import android.widget.TextView;

import org.mazz.restromd.Modal.DashboardModal;
import org.mazz.restromd.R;

import java.util.ArrayList;

public class DashboardAdapter extends BaseAdapter {

    private Context mContext;
    ArrayList<DashboardModal> list;

    LayoutInflater inflater ;

    public DashboardAdapter(Context c, ArrayList<DashboardModal> objects ) {
        mContext = c;
        this.list = objects;
        inflater = (LayoutInflater) mContext
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//        this.Imageid = Imageid;
//        this.string = string;
    }

    @Override
    public int getCount() {
        if(list.size() == 0){
            return 0;
        }else{
            return list.size();
        }
    }

    public DashboardModal getItem(int position) {
        return list.get(position);
    }


    @Override
    public long getItemId(int p) {
        return 0;
    }

    @Override public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.dashboard_grid_view, parent, false);
            convertView.setTag(new ViewHolder(convertView));
        }

        final ViewHolder holder = (ViewHolder) convertView.getTag();

        final DashboardModal dashboardModal = list.get(position);


        holder.dashboardText.setText(dashboardModal.getDashboardText());
        holder.dashboardImage.setImageResource(dashboardModal.getDashboardImage());
        return convertView;
    }

    static class ViewHolder {
        TextView dashboardText;
        ImageView dashboardImage;


        ViewHolder(View root) {
            dashboardText = (TextView) root.findViewById(R.id.dashboard_tv);
            dashboardImage= (ImageView) root.findViewById(R.id.dashboard_imgv);


        }
    }
}
