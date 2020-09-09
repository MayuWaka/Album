package app.wakayama.tama.album2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_preview.*

class PreviewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_preview)

        //前の画面から写真を受け取る
        val imageId = intent.getIntExtra("image",0)
        //前の画面からタイトルを受け取る
        val displayTitle = intent.getStringExtra("title")
        //受け取った写真をセット
        previewImage.setImageResource(imageId)
        //受け取ったタイトルをセット
        titleText.text = displayTitle

        backButton.setOnClickListener {
            finish()
        }
    }
}
