/*package com.lz.util;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.ImageIO;

import com.sun.image.codec.jpeg.JPEGCodec;
import com.sun.image.codec.jpeg.JPEGEncodeParam;
import com.sun.image.codec.jpeg.JPEGImageEncoder;

import net.coobird.thumbnailator.Thumbnails;

public abstract class Lztest1
{
   public static void main(String[] args) throws FileNotFoundException, IOException
{
       File srcfile = new File("d://444.PNG"); 
       File distfile = new File("d://333_.PNG");
       
       System.out.println("ѹ��ǰͼƬ��С��" + srcfile.length());
       float rate=(float)(100000.0/srcfile.length());
       System.err.println(rate);
       reduceImg("d://444.PNG", "d://333_.PNG", 500, 500,rate );
       System.out.println("ѹ����ͼƬ��С��" + distfile.length());
    
    

}
   
   public static void reduceImg(String imgsrc, String imgdist, int widthdist, int heightdist, Float rate) {
       try {
           File srcfile = new File(imgsrc);
           // ���ͼƬ�ļ��Ƿ����
           if (!srcfile.exists()) {
               System.out.println("�ļ�������");
           }
           // ���������Ϊ����˵���ǰ�����ѹ��
           if (rate != null && rate > 0) {
               //���ԴͼƬ�Ŀ�ߴ���������
               int[] results = getImgWidthHeight(srcfile);
               if (results == null || results[0] == 0 || results[1] == 0) {
                   return;
               } else {
                   //���������Ż�����ͼƬ��С����������תΪ����
                   widthdist = (int) (results[0] * rate);
                   heightdist = (int) (results[1] * rate);
               }
           }
           // ��ʼ��ȡ�ļ�������ѹ��
           Image src = ImageIO.read(srcfile);

           // ����һ������ΪԤ����ͼ������֮һ�� BufferedImage
           BufferedImage tag = new BufferedImage((int) widthdist, (int) heightdist, BufferedImage.TYPE_INT_RGB);

           //����ͼ��  getScaledInstance��ʾ������ͼ������Ű汾������һ���µ����Ű汾Image,��ָ����width,height����ͼ��
           //Image.SCALE_SMOOTH,ѡ��ͼ��ƽ���ȱ������ٶȾ��и������ȼ���ͼ�������㷨��
           tag.getGraphics().drawImage(src.getScaledInstance(widthdist, heightdist, Image.SCALE_SMOOTH), 0, 0, null);

           //�����ļ������
           FileOutputStream out = new FileOutputStream(imgdist);
           //��ͼƬ��JPEGѹ�������浽out��
           JPEGImageEncoder encoder = JPEGCodec.createJPEGEncoder(out);
           
           encoder.encode(tag);
           //�ر��ļ������
           out.close();
       } catch (Exception ef) {
           ef.printStackTrace();
       }
   }
   
   public static int[] getImgWidthHeight(File file) {
       InputStream is = null;
       BufferedImage src = null;
       int result[] = { 0, 0 };
       try {
           // ����ļ�������
           is = new FileInputStream(file);
           // �����ｫͼƬд�뻺��ͼƬ��
           src = ImageIO.read(is);
           result[0] =src.getWidth(null); // �õ�ԴͼƬ��
           result[1] =src.getHeight(null);// �õ�ԴͼƬ��
           is.close();  //�ر�������
       } catch (Exception ef) {
           ef.printStackTrace();
       }

       return result;
   }
}
*/