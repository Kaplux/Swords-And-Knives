package fr.mildlyusefulsoftware.swordsandknives.activity;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.util.Log;
import fr.mildlyusefulsoftware.imageviewer.service.DatabaseHelper;
import fr.mildlyusefulsoftware.imageviewer.service.Picture;

public class ViewPictureActivity extends fr.mildlyusefulsoftware.imageviewer.activity.ViewPictureActivity {

	@Override
	protected String getAdMobId() {
		return "a1501e557ab9911";
	}

	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//putNewPictures();
	}
	
	private void putNewPictures(){
		String[] url =new String[]{
				"http://www.unitedmask.com/Theme_Party_Supplies/images/pirate_sword__knife.JPG",
				"http://www.swordsswords.com/ProductImages/s/KM033_2.jpg",
				"http://www.swordsantiqueweapons.com/images/s443.jpg",
				"http://www.swordsantiqueweapons.com/images/s209.jpg",
				"http://www.hibbenknives.com/images/CustomKnives/Art%20Knives/St_George_Sword.jpg",
				"http://www.northstarzone.com/sitebuildercontent/sitebuilderpictures/114-2081.jpg",
				"http://www.warrelics.eu/forum/military_photos/edged-weapons/65921d1259013464t-sas-iban-trackers-sword-knife-iban-sword-001.jpg",
				"http://i263.photobucket.com/albums/ii143/prommes/pendant2/sword_pendant_1.jpg",
				"http://www.turbocarver.com/customerartwork/MichaelPearce/MichaelPearce_Sword_Knife.jpg",
				"http://img.frbiz.com/news/172455_s/Mongolian_knife_sweat_golden_sword_still_Commodities_exchange_of_Need_sweat_golden_sword_Mongolia_knife_gift_handicraft_industry.jpg",
				"http://www.trocadero.com/101antiques/items/493259/catphoto.jpg",
				"http://anticobello.com/images/296530458_tp.jpg",
				"http://anticobello.com/images/296478245_tp.jpg",
				"http://www.aceros-de-hispania.com/image/battle-ready-sword/1706-riddick-knife.jpg",
				"http://reigninggifts.com/images/Warrior%20Eagle%20Tanto%20Knife30313847.jpg",
				"http://www.kingofswords.com/images/BushidoMusashiZetsurinSwordKnifeFullTangBlackSaya.jpg",
				"http://jaysknives.com/camillusknives/SilverSword2BladePenKnife.jpg",
				"http://3.bp.blogspot.com/-QbUTcf4UfS4/T5YjBl5jlVI/AAAAAAAAAl4/53DzdDd2wR0/s1600/SwordKnife.jpg",
				"http://www.southernswords.co.uk/ekmps/shops/southernswords/images/strider-s-ranger-sword-and-sheath-with-knife-801-p.jpg",
				"http://www.freeideals.com.au/store/CubeCart-latest/images/uploads/dagger%20BWW%2005.jpg",
				"http://galleryplus.ebayimg.com/ws/web/170875447426_1_0_1.jpg",
				"http://i40.photobucket.com/albums/e227/ishjunkita/DMYK30BBe.jpg",
				"http://i40.photobucket.com/albums/e227/ishjunkita/YODMYK27-1-1.jpg",
				"http://i01.i.aliimg.com/wsphoto/v0/546662073/Available-Rambo-VI-fixed-two-edged-sword-hunting-knife-keel-ABS-processing-straight-knife-camping-knife.jpg",
				"http://25.media.tumblr.com/tumblr_m2hqqySFs71rt6ar0o1_500.jpg",
				"http://www.freeideals.com.au/store/CubeCart-latest/images/uploads/sword%20dao%20and%20throwing%20knife%2003.jpg",
				"http://alwaysknives.com/wp-content/uploads/2011/12/5009.jpg",
				"http://www.arms2armor.com/knives/islamic/jambiya_024c.jpg",
				"http://www.kaswords.com/productimages/s/PK-5055BR_2.jpg",
				"http://i.ebayimg.com/t/Antique-Moroccan-Dagger-Arab-Jambiya-Islamic-Arabic-Koummya-Arabian-sword-/00/s/OTAwWDkwMA==/$(KGrHqZ,!pQE8WTrTpQEBPW79PesKw~~60_57.JPG",
				"http://galleryplus.ebayimg.com/ws/web/280882143765_1_0_1.jpg",
				"http://cdn.paulkirtley.co.uk/wp-content/uploads/2011/08/Dartmoor-Knife-CSK185-and-Wilkinson-Sword-Survival-Knife_650.jpg",
				"http://worldwar1weapons.net/wp-content/uploads/2012/06/-253632709920630050.jpg",
				"http://www.perkinknives.com/ekmps/shops/perkinsteel/images/custom-handmade-damascus-hunting-knife-mini-sword-[4]-262-p.jpg",
				"http://www.knifeforums.com/forums/fbbuploads/1310066853-IMG_6784.jpg",
				"http://www.kaswords.com/productimages/s/SW1027-310_2.jpg",
				"http://www.linder.de/pics/products/_zoom/450007_zoom.jpg",
				"http://www.alhakaya.net/img/p/104-350-large.jpg",
				"http://www.cdpetronisinc.com/images/Bowie_Style_Knife_and_Sheath_Etched_2_.jpg",
				"http://thekingofsword.com/images/201206/source_img/Leijian%20knife_G_1340019589554.JPG",
				"http://www.where-what.net/images/knives_swords_daggers.jpg",
				"http://www.learn-chinese-martial-arts.com/images/Miao-dao-sword.gif",
				"http://www.antiquesnavigator.com/ebay/images/2010/360312606814.jpg",
				"http://www.antiquesnavigator.com/ebay/images/2012/270926426757.jpg",
				"http://www.perkinknives.com/ekmps/shops/perkinsteel/images/custom-handmade-damascus-hunting-knife-mini-sword-262-p.jpg",
				
				
		};
		int i=40;
		List<Picture> pictures=new ArrayList<Picture>();
		for (int j=0;j<url.length;j++){
			try {
				Log.i("swordsandknives",url[j]);
				Picture p = new Picture(j+i, url[j],Picture.getPictureThumbnail(url[j]));
				pictures.add(p);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		DatabaseHelper.connect(this).putPictures(pictures);
	}


}
