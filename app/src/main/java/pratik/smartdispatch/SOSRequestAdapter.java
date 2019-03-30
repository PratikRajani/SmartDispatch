package pratik.smartdispatch;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class SOSRequestAdapter extends RecyclerView.Adapter<SOSRequestAdapter.RequestViewHolder> {

    private Context context;
    private List<SOSRequest> requestList;

    public SOSRequestAdapter(Context context, List<SOSRequest> requestList) {
        this.context = context;
        this.requestList = requestList;
    }

    @NonNull
    @Override
    public SOSRequestAdapter.RequestViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        LayoutInflater layoutInflater = LayoutInflater.from(viewGroup.getContext());
        View view = layoutInflater.inflate(R.layout.sos_card, null);
        RequestViewHolder requestViewHolder = new RequestViewHolder(view);
        return requestViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RequestViewHolder requestViewHolder, int i) {

        SOSRequest request = requestList.get(i);

        requestViewHolder.emergencyType.setText(request.getEmergencyType());
        requestViewHolder.severity.setText(request.getSeverity());
        requestViewHolder.latitude.setText(request.getLatitude());
        requestViewHolder.longitude.setText(request.getLongitude());
        requestViewHolder.vehicleId.setText(request.getVehicleId());
        requestViewHolder.hospitalId.setText(request.getHospitalId());
        requestViewHolder.requesterName.setText(request.getRequesterName());
    }

    @Override
    public int getItemCount() {
        return requestList.size();
    }

    class RequestViewHolder extends RecyclerView.ViewHolder {

        public TextView emergencyType, severity, latitude, longitude, vehicleId, hospitalId, requesterName;

        public RequestViewHolder(@NonNull View itemView) {
            super(itemView);

            emergencyType = itemView.findViewById(R.id.emergencyType);
            severity = itemView.findViewById(R.id.severity);
            latitude = itemView.findViewById(R.id.latitude);
            longitude = itemView.findViewById(R.id.longitude);
            vehicleId = itemView.findViewById(R.id.vehicleId);
            hospitalId = itemView.findViewById(R.id.hospitalId);
            requesterName = itemView.findViewById(R.id.requesterName);
        }
    }
}
