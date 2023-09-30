package com.example.loginpage

//import androidx.compose.material3.icons.*
//import androidx.compose.material3.icons.filled.*
import android.content.Context
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.loginform.ui.theme.LoginFormTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LoginFormTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    SignUpPage()
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SignUpPage() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            //.padding(16.dp)
            .background(Color(51, 66, 90)),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

    ) {
        Text(
            "Sign Up Page",
            color = Color.White,
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(bottom = 20.dp)
        )
        OutlinedTextField(
            value = "",
            onValueChange = { /* TODO */ },
            label = {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(Icons.Filled.Person, contentDescription = null,tint = Color.White)
                    Spacer(Modifier.width(8.dp))
                    Text("First Name",
                        color = Color.White)
                }
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp)
            //.border(3.dp, Color.White)
        )

        OutlinedTextField(
            value = "",
            onValueChange = { /* TODO */ },
            label = {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(Icons.Filled.Person, contentDescription = null,tint = Color.White)
                    Spacer(Modifier.width(8.dp))
                    Text("Last Name",
                        color = Color.White)
                }
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp)
        )

        OutlinedTextField(
            value = "",
            onValueChange = { /* TODO */ },
            label = {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(Icons.Filled.Email, contentDescription = null,tint = Color.White)
                    Spacer(Modifier.width(8.dp))
                    Text("Email",
                        color = Color.White)
                }
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp)
        )
        OutlinedTextField(
            value = "",
            onValueChange = { /* TODO */ },
            label = {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(Icons.Filled.Lock, contentDescription = null,tint = Color.White)
                    Spacer(Modifier.width(8.dp))
                    Text("Password",
                        color = Color.White)
                }
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp)
        )
        OutlinedTextField(
            value = "",
            onValueChange = { /* TODO */ },
            label = {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(Icons.Filled.Phone, contentDescription = null,tint = Color.White)
                    Spacer(Modifier.width(8.dp))
                    Text("Phone",
                        color = Color.White)
                }
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp)
        )

        // Add other necessary input fields here
        val mContext = LocalContext.current

        Button(
            onClick = { mToast(context = mContext) },
            modifier = Modifier
                .padding(17.dp)
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Icon(Icons.Filled.Person, contentDescription = null, tint = Color.White)
                Spacer(Modifier.width(4.dp))
                Text("Sign Up")
            }
        }
        Text("Already have an account?", color = Color.White)
        Text("Sign In", color = Color.White)

    }

}
fun mToast(context: Context){
    Toast.makeText(context,"Signed Up Successfully!", Toast.LENGTH_SHORT).show()
}


@Preview(showBackground = true)
@Composable
fun SignUpPagePreview() {
    LoginFormTheme {
        SignUpPage()
    }
}
