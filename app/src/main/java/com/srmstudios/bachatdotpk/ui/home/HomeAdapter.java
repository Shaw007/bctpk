package com.srmstudios.bachatdotpk.ui.home;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.srmstudios.bachatdotpk.R;
import com.srmstudios.bachatdotpk.data.network.model.response.ShoppingMallResponse;
import com.srmstudios.bachatdotpk.util.ImageLoadUtil;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Admin on 10/31/2017.
 */

public class HomeAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{
    private ImageLoadUtil imageLoadUtil;
    private List<ShoppingMallResponse> shoppingMalls;
    private IShoppingMallItemClickListener iShoppingMallItemClickListener;

    public HomeAdapter(ImageLoadUtil imageLoadUtil,IShoppingMallItemClickListener iShoppingMallItemClickListener,List<ShoppingMallResponse> shoppingMalls){
        this.imageLoadUtil = imageLoadUtil;
        this.shoppingMalls = shoppingMalls;
        this.iShoppingMallItemClickListener = iShoppingMallItemClickListener;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.shopping_mall_item,parent,false);
        HomeViewHolder homeViewHolder = new HomeViewHolder(v);
        return homeViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if(holder instanceof HomeViewHolder){
            ShoppingMallResponse shoppingMall = this.shoppingMalls.get(position);
            HomeViewHolder homeViewHolder = (HomeViewHolder) holder;
            if(shoppingMall.getName() != null){
                homeViewHolder.txtName.setText(shoppingMall.getName());
            }
            if(shoppingMall.getAvatar() != null){
                imageLoadUtil.loadShoppingMallAvatarImage(homeViewHolder.imgPicture,shoppingMall.getAvatar());
            }
        }
    }

    @Override
    public int getItemCount() {
        return shoppingMalls.size();
    }

    public class HomeViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        @BindView(R.id.imgPicture)
        ImageView imgPicture;
        @BindView(R.id.txtName)
        TextView txtName;

        public HomeViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }

        @Override
        public void onClick(View view) {
            iShoppingMallItemClickListener.onShoppingMallItemClick(shoppingMalls.get(getLayoutPosition()));
        }
    }
}






























