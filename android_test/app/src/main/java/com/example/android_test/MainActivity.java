package com.example.android_test; // 替换为你的实际包名

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main); // 关联你的布局文件
//        setContentView(R.layout.demo1_linealayout_test); // 关联你的布局文件
//        setContentView(R.layout.demo1_constraintlayout_test); // 关联你的布局文件
        setContentView(R.layout.demo1_constraintlayout_test2); // 关联你的布局文件

        // 1. 获取 TextView 控件（通过ID找到布局中的TextView）

        // 2. 设置 TextView 的点击事件（可选：增强交互性）

        // 3. 动态修改文本内容（可选：演示数据更新）
        // helloWorldTextView.setText("动态修改的文字"); // 取消注释即可修改文本
    }
}