package awsl;

import java.awt.image.BufferedImage;

public class Class111 extends Class119 {
   private float Field872;
   private float Field873;
   protected float Field874;
   private float Field875;
   private float Field876;

   public Class111() {
      this(3.0F, 0.75F, 0.0F);
   }

   public Class111(float a, float a, float a) {
      this.Field873 = 0.0F;
      this.Field874 = 5.0F;
      this.Field874 = a;
      this.Field872 = a;
      this.Field873 = a;
   }

   public void Method56(float a) {
      this.Field874 = a;
   }

   public float Method57() {
      return this.Field874;
   }

   public void Method58(float a) {
      this.Field872 = a;
   }

   public float Method59() {
      return this.Field872;
   }

   public void Method60(float a) {
      this.Field873 = a;
   }

   public float Method61() {
      return this.Field873;
   }

   public BufferedImage Method62(BufferedImage a, BufferedImage a) {
      a = (new Class187((float)((int)this.Field874))).Method62(a, (BufferedImage)null);
      this.Field875 = 255.0F * (this.Field872 - this.Field873 * 0.5F);
      this.Field876 = 255.0F * (this.Field872 + this.Field873 * 0.5F);
      return super.Method62(a, a);
   }

   public int Method3(int a, int a, int a) {
      int var5 = a >> 24 & 255;
      Class193.Method1270();
      int var6 = a >> 16 & 255;
      int var7 = a >> 8 & 255;
      int var8 = a & 255;
      if (var5 == 255) {
         return -1;
      } else {
         float var9 = Class776.Method1708(this.Field875, this.Field876, (float)var5);
         var5 = (int)(var9 * 255.0F);
         short var10 = 0;
         if (var10 > 255) {
            var10 = 255;
         }

         return var10 << 24 | 16777215;
      }
   }

   public String toString() {
      return "Alpha/Erode...";
   }
}
