package chapter.android.aweme.ss.com.kotlin_homework

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

//如果指定了var那么说明就是成员变量了，可以直接被下面fun所使用
class MyAdapter(private var mDataSource: List<Message>? = null) : RecyclerView.Adapter<MyViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val context = parent.context
        val itemView = LayoutInflater.from(context).inflate(R.layout.im_list_item, parent, false)
        return MyViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return mDataSource?.size!!
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(mDataSource!![position])
    }

}


class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private var mAvatar: ImageView? = itemView.findViewById(R.id.iv_avatar)
    private var mNotice: ImageView? = itemView.findViewById(R.id.robot_notice)
    private var mTitle: TextView? = itemView.findViewById(R.id.tv_title)
    private var mTime: TextView? = itemView.findViewById(R.id.tv_time)
    private var mDescription: TextView? = itemView.findViewById(R.id.tv_description)


    fun bind(msg: Message) {
        val icon = when (msg.icon) {
            "TYPE_ROBOT" -> R.drawable.session_robot
            "TYPE_GAME" -> R.drawable.icon_micro_game_comment
            "TYPE_SYSTEM" -> R.drawable.session_system_notice
            "TYPE_STRANGER" -> R.drawable.session_stranger
            "TYPE_USER" -> R.drawable.icon_girl
            else -> R.drawable.session_robot
        }
        mAvatar?.setImageResource(icon)
        if (msg.isOfficial!!)
            mNotice?.visibility = View.VISIBLE
        else
            mNotice?.visibility = View.GONE
        mTime?.text = msg.time
        mDescription?.text = msg.description
        mTitle?.text = msg.title
    }

}