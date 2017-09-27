using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace WindowsFormsApp1
{
    
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void label1_Click(object sender, EventArgs e)
        {

        }

        private void button1_Click(object sender, EventArgs e)
        {
            string[] name = new string[10] { "em", "emm", "emmm", "emmmm", "emmmmm", "emmmmmm", "emmmmmmm", "emmmmmmmm", "emmmmmmmmm", "emmmmmmmmmmm" };
            string[] num = new string[10] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" };
            Random ran = new Random();
            int a = ran.Next(0, 10);
            textBox1.Text = num[a].ToString();
            textBox2.Text = name[a].ToString();
        }
    }
}
