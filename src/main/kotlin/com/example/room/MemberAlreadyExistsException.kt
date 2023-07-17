package com.example.room

import java.lang.Exception

class MemberAlreadyExistsException: Exception(
    "A user with that username already exists "
)