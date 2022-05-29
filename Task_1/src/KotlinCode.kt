class KotlinCode {
    public fun toJSON(collection: Collection<Int>): String {
        val colIterator = collection.iterator();
        val sb = buildString {
            append("[")
            while(colIterator.hasNext()) {
                val element = colIterator.next();
                append(element)
                if(colIterator.hasNext()) {
                    append(", ")
                }
            }
            append("]")
        }
        return sb.toString()
    }
}


