fun main() {
    print("Количество лайков: ")
    val likes = readLine() ?: return
    val reminder = if (likes.length < 10) likes else (likes.substring(likes.length - 2))
    val ending = if (reminder == "1" || reminder != "11") "человеку" else "людям"
    print("Понравилось $likes $ending")
}