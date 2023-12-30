package com.ingjadeulloaaa.gergarversant

import java.io.File

interface AudioRecorder {
    fun start(outputFile: File)
    fun stop()
}