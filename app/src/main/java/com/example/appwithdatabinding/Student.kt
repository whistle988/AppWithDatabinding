package com.example.appwithdatabinding

class Student {
    constructor(studentName: String?, studentEmail: String?) {
        this.studentName = studentName
        this.studentEmail = studentEmail
    }

    constructor() {}

    var studentName: String? = null
    var studentEmail: String? = null

}