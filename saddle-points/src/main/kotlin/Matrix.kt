class Matrix(private val matrix: List<List<Int>>) {

    private val columnMinimums = (0 until matrix[0].size).map { col -> matrix.map { it[col] }.min() }

    val saddlePoints: Set<MatrixCoordinate> = matrix.foldIndexed(setOf()) { i, acc, row ->
        row.foldIndexed(acc) { j, acc2, col ->
            if (row.max() == col && columnMinimums[j] == col) {
                acc.plus(MatrixCoordinate(i, j))
            } else acc2
        }
    }
}