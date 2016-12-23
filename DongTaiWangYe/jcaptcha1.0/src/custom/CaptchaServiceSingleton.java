package custom;

import java.awt.Font;

import com.octo.captcha.CaptchaFactory;
import com.octo.captcha.component.image.backgroundgenerator.UniColorBackgroundGenerator;
import com.octo.captcha.component.image.color.RandomRangeColorGenerator;
import com.octo.captcha.component.image.fontgenerator.RandomFontGenerator;
import com.octo.captcha.component.image.textpaster.RandomTextPaster;
import com.octo.captcha.component.image.wordtoimage.ComposedWordToImage;
import com.octo.captcha.component.word.FileDictionary;
import com.octo.captcha.component.word.wordgenerator.ComposeDictionaryWordGenerator;
import com.octo.captcha.engine.GenericCaptchaEngine;
import com.octo.captcha.image.gimpy.GimpyFactory;
import com.octo.captcha.service.image.ImageCaptchaService;
import com.octo.captcha.service.multitype.GenericManageableCaptchaService;



public class CaptchaServiceSingleton {
    private static ImageCaptchaService service = null;
 
    public static ImageCaptchaService getService(){
        if(service == null)
            service = generatorCaptchaService();
        return service;
    }
    /**
     * ����SpringBean�������ļ���д�Ĵ���ʵ��
     * */
    public static ImageCaptchaService generatorCaptchaService(){
        //���������ɫ�������ֱ��ʾRGBA��ȡֵ��Χ
        RandomRangeColorGenerator textColor = new RandomRangeColorGenerator(new int[]{0,255},new int[]{0,180},new int[]{0,210},new int[]{255,255});
        //������ֶ��ٺ���ɫ������1��2��ʾ�������ɶ��ٸ����ֺ�������ɶ��ٸ�
        RandomTextPaster randomTextPaster = new RandomTextPaster(4, 5, textColor,true);
        //���ɱ����Ĵ�С�����ǿ�85��40��ͼƬ��Ҳ�������ñ�����ɫ�����������ɫ������ʹ��Ĭ�ϵİ�ɫ
        UniColorBackgroundGenerator colorbgGen = new UniColorBackgroundGenerator(85,40);
        //������ɵ������С���������ͣ�����1��2��ʾ��С�����������С����������ʾ���������
        RandomFontGenerator randomFontGenerator = new RandomFontGenerator(20, 25, new Font[]{new Font("Arial", 0, 10),new Font("Tahoma",0,10)});
        //�������Ķ��󹹼�һ�����ı�����ͼƬ�Ķ���
        ComposedWordToImage cwti = new ComposedWordToImage(randomFontGenerator,colorbgGen,randomTextPaster);
        //����ı����ֵ䣬������ʹ��jcaptcha-1.0-all.jar�е��ı��ֵ䣬�ֵ�����Ϊtoddlist.properties
        ComposeDictionaryWordGenerator cdwg = new ComposeDictionaryWordGenerator(new FileDictionary("toddlist"));
 
        GimpyFactory gf = new GimpyFactory(cdwg, cwti);
 
        GenericCaptchaEngine gce = new GenericCaptchaEngine(new CaptchaFactory[]{gf});
        //����һ��Service��������180����֤����ڵ�ʱ�䣬��λ���룬200000�����洢��С
        return new GenericManageableCaptchaService(gce,180,200000,75000);
    }
}