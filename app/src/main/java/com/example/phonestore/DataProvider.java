package com.example.phonestore;
import android.util.Log;

import java.util.*;

public class DataProvider {

    private static List<Phone> modelList = new ArrayList<>(); // list of all the phones(products)

    // Adding all the phones(products)
    public static void InitialiseList() {
        
        modelList.add(new Phone(0, "Samsung", "Galaxy A9", "a9_1", "The device is power-driven by Octa-core (2.2 GHz, Quad core, Kryo 260 + 1.8 GHz, Quad core, Kryo 260) processor and is packed with a 6GB of RAM to offer glitch-free experience. It has 6.3\" (16 cm) Super AMOLED display with a screen resolution of 1080 x 2220 pixels, 18.5:9 aspect ratio and 392 PPI pixel density.", 1000));
        modelList.add(new Phone(1, "Samsung", "Galaxy A11", "a11_1", "The phone comes with a 6.40-inch touchscreen display with a resolution of 720x1560 pixels. Samsung Galaxy A11 is powered by a 1.8GHz octa-core processor. It comes with 2GB of RAM. The Samsung Galaxy A11 runs Android and is powered by a 4000mAh battery.", 1000));
        modelList.add(new Phone(2, "Samsung", "Galaxy A41", "a41_1", "The phone comes with a 6.10-inch touchscreen display with a resolution of 1080x2400 pixels and an aspect ratio of 20:9. Samsung Galaxy A41 is powered by an octa-core processor. It comes with 4GB of RAM. The Samsung Galaxy A41 runs Android 10 and is powered by a 3500mAh non-removable battery.", 1000));
        modelList.add(new Phone(3, "Samsung", "Galaxy M01", "m01_1", "The phone comes with a 5.71-inch touchscreen display with a resolution of 720x1560 pixels and an aspect ratio of 19.5:9. Samsung Galaxy M01 is powered by an octa-core Qualcomm Snapdragon 439 processor. The Samsung Galaxy M01 runs Android 10 and is powered by a 4000mAh battery.", 1000));
        modelList.add(new Phone(4, "Samsung", "Galaxy M21", "m21_1", "The smartphone packs in a 6.4-inch AMOLED display that isn't very common at this price point. It has a vivid output and very good viewing angles.", 1000));
        modelList.add(new Phone(5, "Samsung", "Galaxy M31", "m31_1", "The weight of the smartphone is mainly because of the big 6,000mAh battery that it packs. Samsung has equipped the Galaxy M31 with an Exynos 9611 SoC and gets 6GB of RAM. ", 1000));
        modelList.add(new Phone(6, "Samsung", "Galaxy S9", "s9_1", "On the front, the Galaxy S9 and S9+ look identical to the S8 and S8+. They both feature 1440p Super AMOLED displays, with an 18.5:9 aspect ratio. The S9 has a 5.8-inch panel, while the S9+ uses a larger 6.2-inch panel.", 1000));
        modelList.add(new Phone(7, "Samsung", "Galaxy S10", "s10_1", "This smartphone sits right between the other two devices and has a 6.1-inch display. It also has an ultrasonic in-display fingerprint scanner which is super quick to unlock the smartphone. The sixe of the device is perfect for single-hand use. It also has a hole-punch design at the front.", 1000));
        modelList.add(new Phone(8, "Samsung", "Galaxy S20", "s20u_1", "The Samsung Galaxy S20 goes big in every way imaginable, with 108MP photos, a 100x camera zoom, 40MP selfies, and a 6.9-inch 120Hz display. With over-the-top internal specs on a par with some laptops, you'll pay more for this phone than any non-foldable phone before it, but that's not surprising.", 1000));
        modelList.add(new Phone(9, "Samsung", "Galaxy Z-Flip", "zf_1", "Galaxy Z Flip folds to be surprisingly small for an outstanding design that easily fits into your pocket or bag. Front to back, top to bottom, open to closed.", 1000));

        modelList.add(new Phone(10, "Apple", "iPhone X ", "ix_1", "The iPhone X is the huge leap forward that Apple's handsets needed after ten years, and it's even better in 2019 thanks to its iOS 13 update. Aside from the original iPhone in 2007, this iPhone is having the biggest impact on Apple’s smartphone direction ever.", 1000));
        modelList.add(new Phone(11, "Apple", "iPhone SE", "ise2020_1", "The iPhone SE appears to feature the same 4.7-inch display that was used in the iPhone 8 with a resolution of 1334 by 750 with 326 pixels per inch and a 1400:1 contrast ratio. ", 1000));
        modelList.add(new Phone(12, "Apple", "iPhone XR", "ixr_1", "The Apple iPhone XR is a smartphone that was tested with the iOS 12.0. 1 operating system. This model weighs 6.9 ounces, has a 6.1 inch display, 12-megapixel main camera, and 7-megapixel selfie camera. It comes with 3GB of RAM.", 1000));
        modelList.add(new Phone(13, "Apple", "iPhone XS", "ixs_1", "The iPhone Xs is Apple's new flagship smartphone, meaning it's the cream of the crop. It's got a gorgeous 5.8-inch, edge-to-edge OLED display, a dual-lens camera system with both wide and telephoto optics, and Apple's latest and greatest A12 Bionic processor.", 1000));
        modelList.add(new Phone(14, "Apple", "iPhone 8", "i8_1", "The iPhone 8 features a more advanced 12-megapixel wide-angle f/1.8 camera with a larger, faster sensor that lets in 83 percent more light. Other features include a new color filter and deeper pixels for better color saturation, a wider dynamic range of color, and lower noise in photos and videos.", 1000));
        modelList.add(new Phone(15, "Apple", "iPhone 7", "i7_1", "The iPhone 7 and 7 Plus are Apple's lower-cost iPhones, with camera improvements, a glossy black color, faster processors, and improved water resistance implemented through a click-less haptic home button and no headphone jack", 1000));
        modelList.add(new Phone(16, "Apple", "iPhone 11 Pro", "i11pro_1", "The phone comes with a 5.80-inch touchscreen display with a resolution of 1125x2436 pixels at a pixel density of 458 pixels per inch (ppi). iPhone 11 Pro is powered by a hexa-core Apple A13 Bionic processor. ", 1000));
        modelList.add(new Phone(17, "Apple", "iPadPro 2020", "ipadpro2020_1", "The 2020 iPad Pro includes a lidar scanner, which uses pulses of light to help the hardware better interpret depth and understand location and position. It's supposed to be especially useful in augmented-reality apps.", 1000));
        modelList.add(new Phone(18, "Apple", "iPad mini 2019", "ipadmini2019_1", "The tablet comes with a 7.90-inch touchscreen display with a resolution of 1536x2048 pixels at a pixel density of 326 pixels per inch (ppi).", 1000));
        modelList.add(new Phone(19, "Apple", "iPadPro 2018", "ipadpro2018_1", "The new iPad Pro with an eight-core A12X processor is faster than 92 percent of portable PCs sold today! The graphics performance is 1000 times faster than the first-generation iPad and now rivals an Xbox One S!", 1000));

        modelList.add(new Phone(20, "OnePlus", "OnePlus 5", "op5_1", "The phone is powered by Octa core (2.45 GHz, Quad core, Kryo 280 + 1.9 GHz, Quad core, Kryo 280) processor. It runs on the Qualcomm Snapdragon 835 MSM8998 Chipset. It has 6 GB RAM and 64 GB internal storage. OnePlus 5 smartphone has a Optic AMOLED display.", 1049));
        modelList.add(new Phone(21, "OnePlus", "OnePlus 5t", "op5t_1", "The new OnePlus 5T has launched just a few months after the OnePlus 5, and not a lot is different. It has an 18:9 screen, which is now fashionable, and the secondary rear camera has been changed. Instead of a telephoto lens it now has a sensor that's much more suitable for low-light photography.", 1249));
        modelList.add(new Phone(22, "OnePlus", "OnePlus 6", "op6_1", "The OnePlus 6 brings a new glass back with your choice of three different finishes, the Snapdragon 845 processor, and a bigger screen with a notch. It takes on today's biggest flagships, some of which cost over twice as much. Performance is great, and the display will keep most people happy.", 1149));
        modelList.add(new Phone(23, "OnePlus", "OnePlus 6t", "op6t_1", "The new OnePlus 6T introduces an in-display fingerprint sensor that is sure to draw attention and be the one feature that you really want to show off. It also has a smaller notch, bigger screen and higher capacity battery, but loses the notification LED and 3.5mm audio jack.", 1449));
        modelList.add(new Phone(24, "OnePlus", "OnePlus 6t McLaren Edition", "op6tml_1", "The OnePlus 6T McLaren Edition will definitely appeal to fans of McLaren and Formula 1 in general. The meticulously crafted retail box, exclusive accessories, and the speed mark logo made from carbon fibre extracted from an actual McLaren Formula 1 car makes it quite special. That said, the performance improvements are incremental and regular users will be better served by the cheaper, regular variants of the OnePlus 6T.", 1549));
        modelList.add(new Phone(25, "OnePlus", "OnePlus 7", "op7_1", "OnePlus 7 smartphone runs on Android v9.0 (Pie) operating system. The phone is powered by Octa core (2.84 GHz, Single core, Kryo 485 + 2.42 GHz, Tri core, Kryo 485 + 1.8 GHz, Quad core, Kryo 485) processor. It runs on the Qualcomm Snapdragon 855 Chipset. It has 6 GB RAM and 128 GB internal storage.", 1249));
        modelList.add(new Phone(26, "OnePlus", "OnePlus 7t", "op7t_1", "The OnePlus 7T improves upon the last-gen version of the handset with a 90Hz refresh rate screen, some camera improvements, and faster charging. There are tons of other minor improvements, and it all makes up for a more refined and reliable overall smartphone. The 7T is an excellent low-cost flagship.", 1449));
        modelList.add(new Phone(27, "OnePlus", "OnePlus 7t Pro", "op7tpro_1", "The display is the same 6.67-inch QHD+ Fluid AMOLED panel with a 90Hz refresh rate. We found the display to be excellent in most usage conditions. Colours are vibrant and well saturated, the brightness is very good even under sunlight, and viewing angles are great.", 1549));
        modelList.add(new Phone(28, "OnePlus", "OnePlus 8", "op8_1", "The OnePlus 8 has a 6.55-inch AMOLED panel with sloping sides, a wide colour gamut, and a hole-punch cutout in the upper left corner. The 90Hz refresh rate makes usage in general feel fluid and snappy. It also has an in-display fingerprint sensor, which is super quick at authentication. All it takes is a quick, firm tap to unlock it.", 1249));
        modelList.add(new Phone(29, "OnePlus", "OnePlus 8 Pro", "op8pro_1", "OnePlus 8 Pro smartphone runs on Android v10 (Q) operating system. The phone is powered by Octa core (2.84 GHz, Single core, Kryo 585 + 2.42 GHz, Tri core, Kryo 585 + 1.8 GHz, Quad core, Kryo 585) processor. It runs on the Qualcomm Snapdragon 865 Chipset. It has 8 GB RAM and 128 GB internal storage.", 1649));

        modelList.add(new Phone(30, "Xiaomi", "Mi Note 10", "mn10l_1", "The phone comes with a 6.47-inch touchscreen display with a resolution of 1080x2340 pixels. Xiaomi Mi Note 10 is powered by a 2.2GHz octa-core Qualcomm Snapdragon 730G processor. It comes with 6GB of RAM. The Xiaomi Mi Note 10 runs Android 9 and is powered by a 5260mAh non-removable battery.", 899));
        modelList.add(new Phone(31, "Xiaomi", "PocoFone F2", "pf2_1", "Xiaomi Poco F2 smartphone runs on Android v10 (Q) operating system. The phone is powered by Octa core (2.84 GHz, Single core, Kryo 585 + 2.42 GHz, Tri core, Kryo 585 + 1.8 GHz, Quad core, Kryo 585) processor. It runs on the Qualcomm Snapdragon 865 Chipset. It has 6 GB RAM and 128 GB internal storage.", 999));
        modelList.add(new Phone(32, "Xiaomi", "PocoFone X2", "px2_1", "Xiaomi Poco X2 smartphone runs on Android v10 (Q) operating system. The phone is powered by Octa core (2.2 GHz, Dual core, Kryo 470 + 1.8 GHz, Hexa Core, Kryo 470) processor. It runs on the Qualcomm Snapdragon 730G Chipset. It has 6 GB RAM and 64 GB internal storage.", 999));
        modelList.add(new Phone(33, "Xiaomi", "Redmi 9", "rm9_1", "The phone comes with a 6.53-inch touchscreen display with a resolution of 1080x2340 pixels and an aspect ratio of 19.5:9. Redmi Note 9 is powered by an octa-core MediaTek Helio G85 processor. It comes with 3GB of RAM. The Redmi Note 9 runs Android 10 and is powered by a 5020mAh battery.", 500));
        modelList.add(new Phone(34, "Xiaomi", "Redmi 10x", "rm10x_1", "Redmi 10X smartphone was launched on 26th May 2020. The phone comes with a 6.53-inch touchscreen display with a resolution of 2340x1080 pixels at a pixel density of 394 pixels per inch (ppi) and an aspect ratio of 19.5:9. Redmi 10X is powered by an octa-core MediaTek Helio G85 processor.", 699));
        modelList.add(new Phone(35, "Xiaomi", "Redmi K30p", "rmk30p_1", "Redmi 10X smartphone was launched on 26th May 2020. The phone comes with a 6.53-inch touchscreen display with a resolution of 2340x1080 pixels at a pixel density of 394 pixels per inch (ppi) and an aspect ratio of 19.5:9. Redmi 10X is powered by an octa-core MediaTek Helio G85 processor.", 899));
        modelList.add(new Phone(36, "Xiaomi", "Redmi K30 5G", "rmk305g_1", "Redmi K30 smartphone was launched on 10th December 2019. The phone comes with a 6.67-inch touchscreen display with a resolution of 1080x2400 pixels and an aspect ratio of 20:9. Redmi K30 is powered by a 2.2GHz octa-core Qualcomm Snapdragon 730G processor. It comes with 6GB of RAM.", 999));
        modelList.add(new Phone(37, "Xiaomi", "Redmi Note 9", "rmn9_1", "The phone comes with a 6.53-inch touchscreen display with a resolution of 1080x2340 pixels and an aspect ratio of 19.5:9. Redmi Note 9 is powered by an octa-core MediaTek Helio G85 processor. It comes with 3GB of RAM. The Redmi Note 9 runs Android 10 and is powered by a 5020mAh battery.", 600));
        modelList.add(new Phone(38, "Xiaomi", "Redmi Note 9p", "rmn9p_1", "It has a 6.67-inch LCD screen with a 60Hz refresh rate and hole-punch front camera at the top. The processor is a Qualcomm Snapdragon 720G which is surprisingly powerful for this segment. ... There's also an 8-megapixel wide-angle camera, a 5-megapixel macro camera, and a 2-megapixel depth sensor.", 750));
        modelList.add(new Phone(39, "Xiaomi", "Redmi Note 9s", "rmn9s_1", "Redmi Note 9S smartphone was launched on 23rd March 2020. The phone comes with a 6.67-inch touchscreen display with a resolution of 1080x2400 pixels and an aspect ratio of 20:9. Redmi Note 9S is powered by a 2.3GHz octa-core Qualcomm Snapdragon 720G processor. It comes with 4GB of RAM.", 750));

        modelList.add(new Phone(40, "Huawei", "P40 Pro Plus", "p40pp_1", "A phone with a powerful camera. The P40 Pro Plus packs a powerful rear camera, equipped with five lenses (no, that's not a typo), the main one being a 50-megapixel sensor. Among those sensors is a 3x optical zoom lens on the top right and an impressive 10x optical zoom one on the bottom left.", 1000));
        modelList.add(new Phone(41, "Huawei", "P40 lite E", "p40ple_1", "The Huawei P40 Lite E runs Android 9 and is powered by a 4000mAh battery. As far as the cameras are concerned, the Huawei P40 Lite E on the rear packs a 48-megapixel primary camera with an f/1.8 aperture.", 1000));
        modelList.add(new Phone(42, "Huawei", "P Smart S", "pss_1", "Huawei P Smart S is powered by Octa-core (4x2. 2 GHz Cortex-A73 & 4x1. 7 GHz Cortex-A53) CPU, Kirin 710F (12 nm) Chipset and Mali-G51 MP4 GPU along with 128GB 4GB RAM. Huawei P Smart S has 3G, WIFI, Bluetooth, GPS connectivity options on board.", 1000));
        modelList.add(new Phone(43, "Huawei", "P30 Pro", "p30p_1", "The Huawei P30 Pro is an impressive piece of kit. It has a gorgeous curved screen, flagship Kirin 980 processor, IP68 water and dust resistance, reverse wireless charging, a faster in-display fingerprint scanner, and more.", 1000));
        modelList.add(new Phone(44, "Huawei", "Y8p", "y8p_1", "Huawei Y8p is powered by a 1.7GHz octa-core HiSilicon Kirin 710F processor that features 4 cores clocked at 1.7GHz and 4 cores clocked at 2.2GHz.", 1000));
        modelList.add(new Phone(45, "Huawei", "Y8s", "y8s_1", "The phone comes with a 6.50-inch touchscreen display with a resolution of 1080x2340 pixels. Huawei Y8s is powered by a 1.7GHz octa-core HiSilicon Kirin 710 processor that features 4 cores clocked at 2.2GHz and 4 cores clocked at 1.7GHz. It comes with 6GB of RAM.", 1000));
        modelList.add(new Phone(46, "Huawei", "M30 Pro", "m30p_1", "The phone comes with a 6.53-inch touchscreen display with a resolution of 1176x2400 pixels. Huawei Mate 30 Pro is powered by a 1.86GHz octa-core HiSilicon Kirin 990 processor. It comes with 8GB of RAM.", 1000));
        modelList.add(new Phone(47, "Huawei", "Enjoy 10s", "e10s_1", "Huawei Enjoy 10S is powered by a 1.7GHz octa-core HiSilicon Kirin 710F processor that features 4 cores clocked at 1.7GHz and 4 cores clocked at 2.2GHz. It comes with 6GB of RAM.", 1000));
        modelList.add(new Phone(48, "Huawei", "Enjoy Z 5G", "ez5_1", "The phone comes with a 6.57-inch touchscreen display with a resolution of 1080x2400 pixels at a pixel density of 405 pixels per inch (ppi) and an aspect ratio of 20:9. Huawei Enjoy Z 5G comes with 6GB of RAM. ", 1000));
        modelList.add(new Phone(49, "Huawei", "P 40 Pro", "p40p_1", "The Huawei P40 Pro Plus comes with a huge penta-lens camera system. Through a combination of hardware and software, Huawei says the phone is able to achieve 100x zoom. This zoom capability is something Samsung's Galaxy S20 Ultra also features ", 1000));
    }

    // returns a list of all the phones for the Search Activity
    public static List<Phone> getSearchList() {
        return modelList;
    }

    // returns a list of all the defined brands/categories
    public static List<Brand> getBrands() {
        List<Brand> brandList = new ArrayList<Brand>();
        // initialising all the brands
        brandList.add(new Brand(0, "Samsung", "samsung"));
        brandList.add(new Brand(1, "Apple", "apple"));
        brandList.add(new Brand(2, "OnePlus", "oneplus"));
        brandList.add(new Brand(3, "Xiaomi", "xiaomi"));
        brandList.add(new Brand(4, "Huawei", "huawei"));
        return brandList;
    }

    // Each phone has a number of views. Views is the number of times the details of that phone
    // have been opened. generateTopPicks() returns a list of 3 phones with the maximum views.
    public static List<Phone> generateTopPicks() {
        List<Phone> tempModelsList = new ArrayList<>(modelList);
        List<Phone> sortedList = new ArrayList<>();;
        Phone topPhone;
        int maxViews;
        // returns a list of 3 phones(i < 3)
        for (int i = 0; i < 3; i++) {
            maxViews = 0;
            topPhone = new Phone(0, "", "", "", "", 1000);
            // sets topPhone to the phone with maximum views
            for (int j = 0; j < tempModelsList.size(); j++) {
                if (tempModelsList.get(j).getViews() >= maxViews) {
                    maxViews = tempModelsList.get(j).getViews();
                    topPhone = tempModelsList.get(j);
                }
            }
            sortedList.add(topPhone);
            tempModelsList.remove(topPhone);
        }

        return sortedList;
    }

    // generates all the phones(products) of the required brand(category)
    public static List<Phone> generateModels(String brandname) {

        List<Phone> ModelList = new ArrayList<>();

        for(int i = 0; i < modelList.size(); i++) {
            if(modelList.get(i).getBrand().equals(brandname)) {
                ModelList.add(modelList.get(i));
            }
        }

        return ModelList;
    }
}
