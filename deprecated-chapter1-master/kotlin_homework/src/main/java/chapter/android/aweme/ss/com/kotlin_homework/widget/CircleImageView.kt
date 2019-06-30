package chapter.android.aweme.ss.com.kotlin_homework.widget

import android.content.Context
import android.graphics.*
import android.support.v7.widget.AppCompatImageView
import android.util.AttributeSet
import android.widget.ImageView

/**
 * 为了实现都要圆形图片效果，这里直接提供给大家使用该控件
 *
 * @JvmOverloads 如果你没有加上这个注解，它只能重载相匹配的的构造函数，而不是全部
 */
class CircleImageView @JvmOverloads constructor(context: Context?, attrs: AttributeSet? = null, defStyleAttr: Int = 0) :
        AppCompatImageView(context, attrs, defStyleAttr) {


    private var mWidth: Int = 0
    private var mHeight: Int = 0
    private var radius: Float = 0f
    private var xfermode: Xfermode = PorterDuffXfermode(PorterDuff.Mode.DST_IN)
    private var paint: Paint = Paint()
    private var path: Path = Path() // 用来裁剪图片的path


    init {
        scaleType = ImageView.ScaleType.CENTER_CROP
    }


    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        //        // 使用离屏缓存，新建一个srcRectF区域大小的图层
        canvas?.saveLayer(null, null, Canvas.ALL_SAVE_FLAG)
        // ImageView自身的绘制流程，即绘制图片
        super.onDraw(canvas)
        // 给path添加一个圆形
        path.addCircle(width / 2.0f, height / 2.0f, radius, Path.Direction.CCW)
        paint.isAntiAlias = true
        // 画笔为填充模式
        paint.style = Paint.Style.FILL
        // 设置混合模式
        paint.xfermode = xfermode
        // 绘制path
        canvas?.drawPath(path, paint)
        // 清除Xfermode
        paint.xfermode = null
        // 恢复画布状态
        canvas?.restore()
    }

    /**
     * 计算图片原始区域的RectF
     */
    private fun initSrcRectF() {
        radius = Math.min(width, height) / 2.0f
    }


    override fun onSizeChanged(w: Int, h: Int, oldw: Int, oldh: Int) {
        super.onSizeChanged(w, h, oldw, oldh)
        mWidth = w
        mHeight = h
        initSrcRectF()
    }

}
