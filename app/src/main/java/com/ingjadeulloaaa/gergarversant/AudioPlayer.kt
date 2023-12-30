package com.ingjadeulloaaa.gergarversant
import java.io.File

interface AudioPlayer {
    fun playFile(file: File)
    fun stop()
}