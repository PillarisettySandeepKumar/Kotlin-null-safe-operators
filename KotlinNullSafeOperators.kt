fun main(args: Array<String>) {

    val name: String? = null

    // 1.Safe call(?.)
    // use if you don't mind getting null value
    print("The length of the name is ${name?.length}")

    // 2. safe call with (?.let)
    //It executes the block if name is NOT NULL
    name?.let {
        print("The length of the name is ${it.length}")
    }

    // 3. Elvis operator(?:)
    // print length of the name if name is not null,other wise return not null value
    print("The length of the name is ${name?.length ?: "given string is null"}")

    // 4. Not Null Assertion
    //Use it when your sure the given value is NOT-NULL,Other wise
    //it will throw null pointer exception
    print("The length of the name is ${name!!.length}")

}
