package com.example.ui_library.presentation

import android.graphics.drawable.Icon
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.PointerIcon.Companion.Text
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel


@Composable
fun PortfolioCardView(
    viewModel: PortfolioCardViewModel = hiltViewModel()
){
    val portfolio by viewModel.portfolio.collectAsState()

    Box(
        modifier = Modifier
            .padding(16.dp)
            .background(Color.Black, shape = RoundedCornerShape(16.dp))
            .padding(24.dp)
    ) {
        portfolio?.let {
            Column(horizontalAlignment = Alignment.Start) {
                Text(
                    text = "Portfolio value",
                    fontSize = 16.sp,
                    color = Color.Black
                )
                Spacer(modifier = Modifier.height(8.dp))
                Row {
                    Icon(
                        imageVector = Icons.Default.Info,
                        contentDescription = "Money Bag Icon",
                        tint = Color(0xFF6750A4),
                        modifier = Modifier.size(28.dp)
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(
                        text = "${formatCurrency(it.value)} ${it.name}",
                        fontSize = 28.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Black
                    )
                }

                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = "+${it.change} (${it.changePercentage}%)",
                    fontSize = 16.sp,
                    color = Color.Black
                )
            }
        }
    }
}

@Composable
fun formatCurrency(amount: Double): String {
    return String.format("%,.2f", amount)
}
