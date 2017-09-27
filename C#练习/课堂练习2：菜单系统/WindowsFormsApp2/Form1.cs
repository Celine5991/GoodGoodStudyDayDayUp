using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace WindowsFormsApp2
{
    public partial class Form1 : Form
    {
        public static float[] prize1 = new float[5] { 4.5f, 5.5f, 6.5f, 7.5f, 8.5f },prize2=new float[5] { 0, 0, 0, 0, 0, };
        public static float sum=0;//sum1为总价格，sum2为listbox的总价格
        public Form1()
        {
            InitializeComponent();
            listBox1.Text = " ";
        }

        private void label2_Click(object sender, EventArgs e)
        {

        }

        private void comboBox1_SelectedIndexChanged(object sender, EventArgs e)
        {
            switch(comboBox1.SelectedIndex)
            {
                case 0:
                    textBox1.Text = "￥" + prize1[0];
                    break;
                case 1:
                    textBox1.Text = "￥" + prize1[1];
                    break;
                case 2:
                    textBox1.Text = "￥" + prize1[2];
                    break;
                case 3:
                    textBox1.Text = "￥" + prize1[3];
                    break;
                case 4:
                    textBox1.Text = "￥" + prize1[4];
                    break;
            }
        }

        private void textBox1_TextChanged(object sender, EventArgs e)
        {

        }
        private void button1_Click(object sender, EventArgs e)
        {
            if (comboBox1.SelectedIndex != -1)
            {
                listBox1.Items.Add(comboBox1.SelectedItem.ToString() + " " + textBox1.Text.ToString());
                int i = listBox1.Items.Count;
                prize2[i] = prize1[comboBox1.SelectedIndex];
                sum = sum+ prize2[i];
                label6.Text = "￥" + sum.ToString();
                comboBox1.SelectedIndex = -1;
                comboBox1.Text = "请选择菜名";
                textBox1.Text = "所选菜名的价格";
            }
            else
                MessageBox.Show("请选择要添加的菜名！");
        }

        private void label4_Click(object sender, EventArgs e)
        {

        }

        private void button2_Click(object sender, EventArgs e)
        {
            if (listBox1.SelectedIndex != -1)
            {
                int x = listBox1.SelectedIndex + 1;
                sum = sum - prize2[x];
                label6.Text = "￥" + sum.ToString();
                for (int j = x; j < listBox1.Items.Count; j++)
                    prize2[j] = prize2[j+1];
                listBox1.Items.Remove(listBox1.SelectedItem);
            }
            else
                MessageBox.Show("请选择要删除的菜名！");
        }
    }
}
