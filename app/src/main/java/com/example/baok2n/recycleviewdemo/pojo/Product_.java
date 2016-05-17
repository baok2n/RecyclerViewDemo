
package com.example.baok2n.recycleviewdemo.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Product_ {

    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("id")
    @Expose
    private int id;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("downloadable")
    @Expose
    private boolean downloadable;
    @SerializedName("virtual")
    @Expose
    private boolean virtual;
    @SerializedName("permalink")
    @Expose
    private String permalink;
    @SerializedName("sku")
    @Expose
    private String sku;
    @SerializedName("price")
    @Expose
    private String price;
    @SerializedName("regular_price")
    @Expose
    private String regularPrice;
    @SerializedName("sale_price")
    @Expose
    private Object salePrice;
    @SerializedName("price_html")
    @Expose
    private String priceHtml;
    @SerializedName("taxable")
    @Expose
    private boolean taxable;
    @SerializedName("tax_status")
    @Expose
    private String taxStatus;
    @SerializedName("tax_class")
    @Expose
    private String taxClass;
    @SerializedName("managing_stock")
    @Expose
    private boolean managingStock;
    @SerializedName("stock_quantity")
    @Expose
    private int stockQuantity;
    @SerializedName("in_stock")
    @Expose
    private boolean inStock;
    @SerializedName("backorders_allowed")
    @Expose
    private boolean backordersAllowed;
    @SerializedName("backordered")
    @Expose
    private boolean backordered;
    @SerializedName("sold_individually")
    @Expose
    private boolean soldIndividually;
    @SerializedName("purchaseable")
    @Expose
    private boolean purchaseable;
    @SerializedName("featured")
    @Expose
    private boolean featured;
    @SerializedName("visible")
    @Expose
    private boolean visible;
    @SerializedName("catalog_visibility")
    @Expose
    private String catalogVisibility;
    @SerializedName("on_sale")
    @Expose
    private boolean onSale;
    @SerializedName("weight")
    @Expose
    private Object weight;
    @SerializedName("dimensions")
    @Expose
    private Dimensions dimensions;
    @SerializedName("shipping_required")
    @Expose
    private boolean shippingRequired;
    @SerializedName("shipping_taxable")
    @Expose
    private boolean shippingTaxable;
    @SerializedName("shipping_class")
    @Expose
    private String shippingClass;
    @SerializedName("shipping_class_id")
    @Expose
    private Object shippingClassId;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("short_description")
    @Expose
    private String shortDescription;
    @SerializedName("reviews_allowed")
    @Expose
    private boolean reviewsAllowed;
    @SerializedName("average_rating")
    @Expose
    private String averageRating;
    @SerializedName("rating_count")
    @Expose
    private int ratingCount;
    @SerializedName("related_ids")
    @Expose
    private List<Integer> relatedIds = new ArrayList<Integer>();
    @SerializedName("upsell_ids")
    @Expose
    private List<Object> upsellIds = new ArrayList<Object>();
    @SerializedName("cross_sell_ids")
    @Expose
    private List<Object> crossSellIds = new ArrayList<Object>();
    @SerializedName("parent_id")
    @Expose
    private int parentId;
    @SerializedName("categories")
    @Expose
    private List<String> categories = new ArrayList<String>();
    @SerializedName("tags")
    @Expose
    private List<Object> tags = new ArrayList<Object>();
    @SerializedName("images")
    @Expose
    private List<Image> images = new ArrayList<Image>();
    @SerializedName("featured_src")
    @Expose
    private String featuredSrc;
    @SerializedName("attributes")
    @Expose
    private List<Object> attributes = new ArrayList<Object>();
    @SerializedName("downloads")
    @Expose
    private List<Object> downloads = new ArrayList<Object>();
    @SerializedName("download_limit")
    @Expose
    private int downloadLimit;
    @SerializedName("download_expiry")
    @Expose
    private int downloadExpiry;
    @SerializedName("download_type")
    @Expose
    private String downloadType;
    @SerializedName("purchase_note")
    @Expose
    private String purchaseNote;
    @SerializedName("total_sales")
    @Expose
    private int totalSales;
    @SerializedName("variations")
    @Expose
    private List<Object> variations = new ArrayList<Object>();
    @SerializedName("parent")
    @Expose
    private List<Object> parent = new ArrayList<Object>();
    @SerializedName("grouped_products")
    @Expose
    private List<Object> groupedProducts = new ArrayList<Object>();
    @SerializedName("menu_order")
    @Expose
    private int menuOrder;

    /**
     * 
     * @return
     *     The title
     */
    public String getTitle() {
        return title;
    }

    /**
     * 
     * @param title
     *     The title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 
     * @return
     *     The id
     */
    public int getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     * 
     * @param createdAt
     *     The created_at
     */
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * 
     * @return
     *     The updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    /**
     * 
     * @param updatedAt
     *     The updated_at
     */
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * 
     * @return
     *     The type
     */
    public String getType() {
        return type;
    }

    /**
     * 
     * @param type
     *     The type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 
     * @return
     *     The status
     */
    public String getStatus() {
        return status;
    }

    /**
     * 
     * @param status
     *     The status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 
     * @return
     *     The downloadable
     */
    public boolean isDownloadable() {
        return downloadable;
    }

    /**
     * 
     * @param downloadable
     *     The downloadable
     */
    public void setDownloadable(boolean downloadable) {
        this.downloadable = downloadable;
    }

    /**
     * 
     * @return
     *     The virtual
     */
    public boolean isVirtual() {
        return virtual;
    }

    /**
     * 
     * @param virtual
     *     The virtual
     */
    public void setVirtual(boolean virtual) {
        this.virtual = virtual;
    }

    /**
     * 
     * @return
     *     The permalink
     */
    public String getPermalink() {
        return permalink;
    }

    /**
     * 
     * @param permalink
     *     The permalink
     */
    public void setPermalink(String permalink) {
        this.permalink = permalink;
    }

    /**
     * 
     * @return
     *     The sku
     */
    public String getSku() {
        return sku;
    }

    /**
     * 
     * @param sku
     *     The sku
     */
    public void setSku(String sku) {
        this.sku = sku;
    }

    /**
     * 
     * @return
     *     The price
     */
    public String getPrice() {
        return price;
    }

    /**
     * 
     * @param price
     *     The price
     */
    public void setPrice(String price) {
        this.price = price;
    }

    /**
     * 
     * @return
     *     The regularPrice
     */
    public String getRegularPrice() {
        return regularPrice;
    }

    /**
     * 
     * @param regularPrice
     *     The regular_price
     */
    public void setRegularPrice(String regularPrice) {
        this.regularPrice = regularPrice;
    }

    /**
     * 
     * @return
     *     The salePrice
     */
    public Object getSalePrice() {
        return salePrice;
    }

    /**
     * 
     * @param salePrice
     *     The sale_price
     */
    public void setSalePrice(Object salePrice) {
        this.salePrice = salePrice;
    }

    /**
     * 
     * @return
     *     The priceHtml
     */
    public String getPriceHtml() {
        return priceHtml;
    }

    /**
     * 
     * @param priceHtml
     *     The price_html
     */
    public void setPriceHtml(String priceHtml) {
        this.priceHtml = priceHtml;
    }

    /**
     * 
     * @return
     *     The taxable
     */
    public boolean isTaxable() {
        return taxable;
    }

    /**
     * 
     * @param taxable
     *     The taxable
     */
    public void setTaxable(boolean taxable) {
        this.taxable = taxable;
    }

    /**
     * 
     * @return
     *     The taxStatus
     */
    public String getTaxStatus() {
        return taxStatus;
    }

    /**
     * 
     * @param taxStatus
     *     The tax_status
     */
    public void setTaxStatus(String taxStatus) {
        this.taxStatus = taxStatus;
    }

    /**
     * 
     * @return
     *     The taxClass
     */
    public String getTaxClass() {
        return taxClass;
    }

    /**
     * 
     * @param taxClass
     *     The tax_class
     */
    public void setTaxClass(String taxClass) {
        this.taxClass = taxClass;
    }

    /**
     * 
     * @return
     *     The managingStock
     */
    public boolean isManagingStock() {
        return managingStock;
    }

    /**
     * 
     * @param managingStock
     *     The managing_stock
     */
    public void setManagingStock(boolean managingStock) {
        this.managingStock = managingStock;
    }

    /**
     * 
     * @return
     *     The stockQuantity
     */
    public int getStockQuantity() {
        return stockQuantity;
    }

    /**
     * 
     * @param stockQuantity
     *     The stock_quantity
     */
    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    /**
     * 
     * @return
     *     The inStock
     */
    public boolean isInStock() {
        return inStock;
    }

    /**
     * 
     * @param inStock
     *     The in_stock
     */
    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }

    /**
     * 
     * @return
     *     The backordersAllowed
     */
    public boolean isBackordersAllowed() {
        return backordersAllowed;
    }

    /**
     * 
     * @param backordersAllowed
     *     The backorders_allowed
     */
    public void setBackordersAllowed(boolean backordersAllowed) {
        this.backordersAllowed = backordersAllowed;
    }

    /**
     * 
     * @return
     *     The backordered
     */
    public boolean isBackordered() {
        return backordered;
    }

    /**
     * 
     * @param backordered
     *     The backordered
     */
    public void setBackordered(boolean backordered) {
        this.backordered = backordered;
    }

    /**
     * 
     * @return
     *     The soldIndividually
     */
    public boolean isSoldIndividually() {
        return soldIndividually;
    }

    /**
     * 
     * @param soldIndividually
     *     The sold_individually
     */
    public void setSoldIndividually(boolean soldIndividually) {
        this.soldIndividually = soldIndividually;
    }

    /**
     * 
     * @return
     *     The purchaseable
     */
    public boolean isPurchaseable() {
        return purchaseable;
    }

    /**
     * 
     * @param purchaseable
     *     The purchaseable
     */
    public void setPurchaseable(boolean purchaseable) {
        this.purchaseable = purchaseable;
    }

    /**
     * 
     * @return
     *     The featured
     */
    public boolean isFeatured() {
        return featured;
    }

    /**
     * 
     * @param featured
     *     The featured
     */
    public void setFeatured(boolean featured) {
        this.featured = featured;
    }

    /**
     * 
     * @return
     *     The visible
     */
    public boolean isVisible() {
        return visible;
    }

    /**
     * 
     * @param visible
     *     The visible
     */
    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    /**
     * 
     * @return
     *     The catalogVisibility
     */
    public String getCatalogVisibility() {
        return catalogVisibility;
    }

    /**
     * 
     * @param catalogVisibility
     *     The catalog_visibility
     */
    public void setCatalogVisibility(String catalogVisibility) {
        this.catalogVisibility = catalogVisibility;
    }

    /**
     * 
     * @return
     *     The onSale
     */
    public boolean isOnSale() {
        return onSale;
    }

    /**
     * 
     * @param onSale
     *     The on_sale
     */
    public void setOnSale(boolean onSale) {
        this.onSale = onSale;
    }

    /**
     * 
     * @return
     *     The weight
     */
    public Object getWeight() {
        return weight;
    }

    /**
     * 
     * @param weight
     *     The weight
     */
    public void setWeight(Object weight) {
        this.weight = weight;
    }

    /**
     * 
     * @return
     *     The dimensions
     */
    public Dimensions getDimensions() {
        return dimensions;
    }

    /**
     * 
     * @param dimensions
     *     The dimensions
     */
    public void setDimensions(Dimensions dimensions) {
        this.dimensions = dimensions;
    }

    /**
     * 
     * @return
     *     The shippingRequired
     */
    public boolean isShippingRequired() {
        return shippingRequired;
    }

    /**
     * 
     * @param shippingRequired
     *     The shipping_required
     */
    public void setShippingRequired(boolean shippingRequired) {
        this.shippingRequired = shippingRequired;
    }

    /**
     * 
     * @return
     *     The shippingTaxable
     */
    public boolean isShippingTaxable() {
        return shippingTaxable;
    }

    /**
     * 
     * @param shippingTaxable
     *     The shipping_taxable
     */
    public void setShippingTaxable(boolean shippingTaxable) {
        this.shippingTaxable = shippingTaxable;
    }

    /**
     * 
     * @return
     *     The shippingClass
     */
    public String getShippingClass() {
        return shippingClass;
    }

    /**
     * 
     * @param shippingClass
     *     The shipping_class
     */
    public void setShippingClass(String shippingClass) {
        this.shippingClass = shippingClass;
    }

    /**
     * 
     * @return
     *     The shippingClassId
     */
    public Object getShippingClassId() {
        return shippingClassId;
    }

    /**
     * 
     * @param shippingClassId
     *     The shipping_class_id
     */
    public void setShippingClassId(Object shippingClassId) {
        this.shippingClassId = shippingClassId;
    }

    /**
     * 
     * @return
     *     The description
     */
    public String getDescription() {
        return description;
    }

    /**
     * 
     * @param description
     *     The description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 
     * @return
     *     The shortDescription
     */
    public String getShortDescription() {
        return shortDescription;
    }

    /**
     * 
     * @param shortDescription
     *     The short_description
     */
    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    /**
     * 
     * @return
     *     The reviewsAllowed
     */
    public boolean isReviewsAllowed() {
        return reviewsAllowed;
    }

    /**
     * 
     * @param reviewsAllowed
     *     The reviews_allowed
     */
    public void setReviewsAllowed(boolean reviewsAllowed) {
        this.reviewsAllowed = reviewsAllowed;
    }

    /**
     * 
     * @return
     *     The averageRating
     */
    public String getAverageRating() {
        return averageRating;
    }

    /**
     * 
     * @param averageRating
     *     The average_rating
     */
    public void setAverageRating(String averageRating) {
        this.averageRating = averageRating;
    }

    /**
     * 
     * @return
     *     The ratingCount
     */
    public int getRatingCount() {
        return ratingCount;
    }

    /**
     * 
     * @param ratingCount
     *     The rating_count
     */
    public void setRatingCount(int ratingCount) {
        this.ratingCount = ratingCount;
    }

    /**
     * 
     * @return
     *     The relatedIds
     */
    public List<Integer> getRelatedIds() {
        return relatedIds;
    }

    /**
     * 
     * @param relatedIds
     *     The related_ids
     */
    public void setRelatedIds(List<Integer> relatedIds) {
        this.relatedIds = relatedIds;
    }

    /**
     * 
     * @return
     *     The upsellIds
     */
    public List<Object> getUpsellIds() {
        return upsellIds;
    }

    /**
     * 
     * @param upsellIds
     *     The upsell_ids
     */
    public void setUpsellIds(List<Object> upsellIds) {
        this.upsellIds = upsellIds;
    }

    /**
     * 
     * @return
     *     The crossSellIds
     */
    public List<Object> getCrossSellIds() {
        return crossSellIds;
    }

    /**
     * 
     * @param crossSellIds
     *     The cross_sell_ids
     */
    public void setCrossSellIds(List<Object> crossSellIds) {
        this.crossSellIds = crossSellIds;
    }

    /**
     * 
     * @return
     *     The parentId
     */
    public int getParentId() {
        return parentId;
    }

    /**
     * 
     * @param parentId
     *     The parent_id
     */
    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    /**
     * 
     * @return
     *     The categories
     */
    public List<String> getCategories() {
        return categories;
    }

    /**
     * 
     * @param categories
     *     The categories
     */
    public void setCategories(List<String> categories) {
        this.categories = categories;
    }

    /**
     * 
     * @return
     *     The tags
     */
    public List<Object> getTags() {
        return tags;
    }

    /**
     * 
     * @param tags
     *     The tags
     */
    public void setTags(List<Object> tags) {
        this.tags = tags;
    }

    /**
     * 
     * @return
     *     The images
     */
    public List<Image> getImages() {
        return images;
    }

    /**
     * 
     * @param images
     *     The images
     */
    public void setImages(List<Image> images) {
        this.images = images;
    }

    /**
     * 
     * @return
     *     The featuredSrc
     */
    public String getFeaturedSrc() {
        return featuredSrc;
    }

    /**
     * 
     * @param featuredSrc
     *     The featured_src
     */
    public void setFeaturedSrc(String featuredSrc) {
        this.featuredSrc = featuredSrc;
    }

    /**
     * 
     * @return
     *     The attributes
     */
    public List<Object> getAttributes() {
        return attributes;
    }

    /**
     * 
     * @param attributes
     *     The attributes
     */
    public void setAttributes(List<Object> attributes) {
        this.attributes = attributes;
    }

    /**
     * 
     * @return
     *     The downloads
     */
    public List<Object> getDownloads() {
        return downloads;
    }

    /**
     * 
     * @param downloads
     *     The downloads
     */
    public void setDownloads(List<Object> downloads) {
        this.downloads = downloads;
    }

    /**
     * 
     * @return
     *     The downloadLimit
     */
    public int getDownloadLimit() {
        return downloadLimit;
    }

    /**
     * 
     * @param downloadLimit
     *     The download_limit
     */
    public void setDownloadLimit(int downloadLimit) {
        this.downloadLimit = downloadLimit;
    }

    /**
     * 
     * @return
     *     The downloadExpiry
     */
    public int getDownloadExpiry() {
        return downloadExpiry;
    }

    /**
     * 
     * @param downloadExpiry
     *     The download_expiry
     */
    public void setDownloadExpiry(int downloadExpiry) {
        this.downloadExpiry = downloadExpiry;
    }

    /**
     * 
     * @return
     *     The downloadType
     */
    public String getDownloadType() {
        return downloadType;
    }

    /**
     * 
     * @param downloadType
     *     The download_type
     */
    public void setDownloadType(String downloadType) {
        this.downloadType = downloadType;
    }

    /**
     * 
     * @return
     *     The purchaseNote
     */
    public String getPurchaseNote() {
        return purchaseNote;
    }

    /**
     * 
     * @param purchaseNote
     *     The purchase_note
     */
    public void setPurchaseNote(String purchaseNote) {
        this.purchaseNote = purchaseNote;
    }

    /**
     * 
     * @return
     *     The totalSales
     */
    public int getTotalSales() {
        return totalSales;
    }

    /**
     * 
     * @param totalSales
     *     The total_sales
     */
    public void setTotalSales(int totalSales) {
        this.totalSales = totalSales;
    }

    /**
     * 
     * @return
     *     The variations
     */
    public List<Object> getVariations() {
        return variations;
    }

    /**
     * 
     * @param variations
     *     The variations
     */
    public void setVariations(List<Object> variations) {
        this.variations = variations;
    }

    /**
     * 
     * @return
     *     The parent
     */
    public List<Object> getParent() {
        return parent;
    }

    /**
     * 
     * @param parent
     *     The parent
     */
    public void setParent(List<Object> parent) {
        this.parent = parent;
    }

    /**
     * 
     * @return
     *     The groupedProducts
     */
    public List<Object> getGroupedProducts() {
        return groupedProducts;
    }

    /**
     * 
     * @param groupedProducts
     *     The grouped_products
     */
    public void setGroupedProducts(List<Object> groupedProducts) {
        this.groupedProducts = groupedProducts;
    }

    /**
     * 
     * @return
     *     The menuOrder
     */
    public int getMenuOrder() {
        return menuOrder;
    }

    /**
     * 
     * @param menuOrder
     *     The menu_order
     */
    public void setMenuOrder(int menuOrder) {
        this.menuOrder = menuOrder;
    }

}
