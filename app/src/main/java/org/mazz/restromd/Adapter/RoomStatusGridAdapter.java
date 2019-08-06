package org.mazz.restromd.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import org.mazz.restromd.Modal.DashboardModal;
import org.mazz.restromd.Modal.RoomStatusModal;
import org.mazz.restromd.R;

import java.util.ArrayList;

public class RoomStatusGridAdapter extends BaseAdapter {

    private Context mContext;
    ArrayList<RoomStatusModal> list;

    LayoutInflater inflater ;

    public RoomStatusGridAdapter(Context c, ArrayList<RoomStatusModal> objects ) {
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

    public RoomStatusModal getItem(int position) {
        return list.get(position);
    }


    @Override
    public long getItemId(int p) {
        return 0;
    }

    @Override public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.room_status_grid_view, parent, false);
            convertView.setTag(new ViewHolder(convertView));
        }

        final ViewHolder holder = (ViewHolder) convertView.getTag();
        final RoomStatusModal roomStatusModal = list.get(position);

        holder.dashboardText.setText(roomStatusModal.getRoomStatusName());
        holder.dashboardValue.setText(roomStatusModal.getRoomStatusValue());
        return convertView;
    }

    static class ViewHolder {
        TextView dashboardText;
        TextView dashboardValue;
        ViewHolder(View root) {
            dashboardText = (TextView) root.findViewById(R.id.tv_room_status_text);
            dashboardValue = (TextView) root.findViewById(R.id.tv_room_status_value);

        }
    }
}
