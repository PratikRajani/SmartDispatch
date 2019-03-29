package pratik.smartdispatch;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;
import java.util.zip.Inflater;

public class RequestAdapter extends RecyclerView.Adapter<RequestAdapter.RequestViewHolder> {

    private Context context;
    private List<Request> requestList;

    public RequestAdapter(Context context, List<Request> requestList) {
        this.context = context;
        this.requestList = requestList;
    }

    @NonNull
    @Override
    public RequestAdapter.RequestViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        LayoutInflater layoutInflater = LayoutInflater.from(viewGroup.getContext());
        View view = layoutInflater.inflate(R.layout.list_layout, null);
        RequestViewHolder requestViewHolder = new RequestViewHolder(view);
        return requestViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RequestViewHolder requestViewHolder, int i) {

        Request request = requestList.get(i);

        requestViewHolder.usrname.setText(request.getUsrname());
        requestViewHolder.usrage.setText(request.getUsrage());
        requestViewHolder.usrsex.setText(request.getUsrsex());
        requestViewHolder.drivername.setText(request.getDrivername());
        requestViewHolder.contactno.setText(request.getContactno());
        requestViewHolder.vehicleno.setText(request.getVehicleno());
    }

    @Override
    public int getItemCount() {
        return requestList.size();
    }

    class RequestViewHolder extends RecyclerView.ViewHolder {

        public TextView usrname, usrage, usrsex, drivername, contactno, vehicleno;

        public RequestViewHolder(@NonNull View itemView) {
            super(itemView);

            usrname = itemView.findViewById(R.id.usrname);
            usrage = itemView.findViewById(R.id.usrage);
            usrsex = itemView.findViewById(R.id.usrsex);
            drivername = itemView.findViewById(R.id.drivername);
            contactno = itemView.findViewById(R.id.contactno);
            vehicleno = itemView.findViewById(R.id.vehicleno);
        }
    }
}
