import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.amharicliteretureapp.Book
import com.example.amharicliteretureapp.BooksDetailActivity
import com.example.amharicliteretureapp.R

class BookAdapter(private val books: List<Book>) : RecyclerView.Adapter<BookAdapter.BookViewHolder>() {

    // ViewHolder class to hold reference to each item’s views
    class BookViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val titleTextView: TextView = itemView.findViewById(R.id.booktitle)
        val authorTextView: TextView = itemView.findViewById(R.id.bookAuthor)
        val coverImageView: ImageView = itemView.findViewById(R.id.bookThumbnail)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_book_card, parent, false)
        return BookViewHolder(view)
    }

    override fun onBindViewHolder(holder: BookViewHolder, position: Int) {
        val book = books[position]
        holder.titleTextView.text = book.title
        holder.authorTextView.text = book.author
        holder.coverImageView.setImageResource(book.coverImage)

        // Set up click listener to navigate to BookDetailActivity
        holder.itemView.setOnClickListener {
            val context = holder.itemView.context
            val intent = Intent(context, BooksDetailActivity::class.java).apply {
                putExtra("book_title", book.title)
                putExtra("book_author", book.author)
                putExtra("book_cover", book.coverImage)
            }
            context.startActivity(intent)
        }
    }

    override fun getItemCount() = books.size
}