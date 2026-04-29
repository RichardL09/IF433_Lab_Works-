package oop_00000107431_RichardLiu.week10

data class ApiResponse<T>(
    val status: String,
    val data: T
)