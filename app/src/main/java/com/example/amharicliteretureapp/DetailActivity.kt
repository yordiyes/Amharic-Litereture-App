// DetailActivity.kt
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.amharicliteretureapp.R

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detail_activity)

        val bookTitle = intent.getStringExtra(EXTRA_TITLE)
        val bookAuthor = intent.getStringExtra(EXTRA_AUTHOR)
        val bookDescription = intent.getStringExtra(EXTRA_DESCRIPTION)
        val bookThumbnailResId = intent.getIntExtra(EXTRA_THUMBNAIL, 0)

        findViewById<TextView>(R.id.bookTitleDetailTextView).text = bookTitle
        findViewById<TextView>(R.id.bookAuthorDetailTextView).text = "by $bookAuthor"
        findViewById<TextView>(R.id.bookDescriptionDetailTextView).text = bookDescription
        findViewById<ImageView>(R.id.bookThumbnailDetailImageView).setImageResource(bookThumbnailResId)
    }

    companion object {
        private const val EXTRA_TITLE = "extra_title"
        private const val EXTRA_AUTHOR = "extra_author"
        private const val EXTRA_DESCRIPTION = "extra_description"
        private const val EXTRA_THUMBNAIL = "extra_thumbnail"

        fun newIntent(context: Context, title: String, author: String, description: String, thumbnailResId: Int): Intent {
            return Intent(context, DetailActivity::class.java).apply {
                putExtra(EXTRA_TITLE, title)
                putExtra(EXTRA_AUTHOR, author)
                putExtra(EXTRA_DESCRIPTION, description)
                putExtra(EXTRA_THUMBNAIL, thumbnailResId)
            }
        }
    }
}
