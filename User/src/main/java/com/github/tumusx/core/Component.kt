package com.github.tumusx.core

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun Component() {
    Column(modifier = Modifier.fillMaxSize()) {
        Text("Módulo de usuário!", Modifier.padding(16.dp))
        Text(
            "Este é um módulo de usuário que pode ser utilizado em qualquer aplicação.",
            Modifier.padding(16.dp)
        )
    }
}