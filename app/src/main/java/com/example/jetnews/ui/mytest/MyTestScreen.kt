package com.example.jetnews.ui.mytest

import androidx.compose.Composable
import androidx.compose.unaryPlus
import androidx.ui.core.Text
import androidx.ui.core.dp
import androidx.ui.layout.Column
import androidx.ui.layout.Spacing
import androidx.ui.material.Divider
import androidx.ui.material.MaterialTheme
import androidx.ui.material.TopAppBar
import com.example.jetnews.R
import com.example.jetnews.ui.VectorImage
import com.example.jetnews.ui.VectorImageButton

@Composable
fun MyTestScreen(openDrawer: () -> Unit) {
    Column {
        TopAppBar(
            title = { Text("Interests") },
            navigationIcon = {
                VectorImageButton(R.drawable.ic_jetnews_logo) {
                    openDrawer()
                }
            }
        )
        Column {
            Text(modifier = Spacing(all = 10.dp), text = "hello compose", style = (+MaterialTheme.typography()).h4)
            Divider(height = 2.dp, color = (+MaterialTheme.colors()).primary)
            VectorImage(id = R.drawable.ic_account_circle_black, modifier = Spacing(all = 10.dp))
        }
    }
}